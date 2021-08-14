# Greetings app

The project consist of a **frontend sevice called as helloapp** and **backend greeting application**. 
The helloapp welcome screen on loading calls greeting service which return it the message 
'14/08/2021 13:14 Hello Anurag'. Right now Anurag is value of configured name which is 
environment variable ${service.greetings.name}


## Acknowledgements

 - [Awesome Readme Templates](https://awesomeopensource.com/project/elangosundar/awesome-README-templates)
 - [Awesome README](https://github.com/matiassingers/awesome-readme)
 - [How to write a Good readme](https://bulldogjob.com/news/449-how-to-write-a-good-readme-for-your-github-project)

  
## API Reference

#### Get greetings

```http
  GET //greetings 
```

Returns **'14/08/2021 13:14 Hello $name'**
where name is environment variable



  
## Demo

**Curl backend service output**

  ![curl-backend](https://user-images.githubusercontent.com/59208873/129453113-e039ef7d-94e9-4d37-8b67-34f311b6eeee.png)



**Frontend service**

![FrontEndWithBackend](https://user-images.githubusercontent.com/59208873/129453131-371159b0-034e-4cc5-935a-685adf51af85.PNG)


**Application Deployment on Kubernetes**

![commandpromptkubectl](https://user-images.githubusercontent.com/59208873/129453139-a175c6d0-4cdf-4c74-8511-05b009414048.PNG)


![minikubedashboard](https://user-images.githubusercontent.com/59208873/129453133-dd22b252-1d35-41c2-ae18-1b01f7cfd825.PNG)


## Authors

- [@anurag171](https://github.com/anurag171/greetingsfinal)

  
## Badges

Add badges from somewhere like: [shields.io](https://shields.io/)

[![MIT License](https://img.shields.io/apm/l/atomic-design-ui.svg?)](https://github.com/tterb/atomic-design-ui/blob/master/LICENSEs)
[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)](https://opensource.org/licenses/)
[![AGPL License](https://img.shields.io/badge/license-AGPL-blue.svg)](http://www.gnu.org/licenses/agpl-3.0)

  ## Color Reference

| Color             | Hex                                                                |
| ----------------- | ------------------------------------------------------------------ |
| Example Color | ![#0a192f](https://via.placeholder.com/10/0a192f?text=+) #0a192f |
| Example Color | ![#f8f8f8](https://via.placeholder.com/10/f8f8f8?text=+) #f8f8f8 |
| Example Color | ![#00b48a](https://via.placeholder.com/10/00b48a?text=+) #00b48a |
| Example Color | ![#00d1a0](https://via.placeholder.com/10/00b48a?text=+) #00d1a0 |



## Deployment

Clone the project into your favourite ide
```bash
  git clone hhttps://github.com/anurag171/greetingsfinal
```
## General Deployment Steps
Go to the project directory greetingsfinal

  - **cd /greetservice/**
  - **docker build -t <your git user>/greet-service .**
  - **docker push <your git user>/greet-service**

  - **cd /helloapp/**
  - **docker build -t <your git user>/helloapp .**
  - **docker push <your git user>/helloapp**
  
  ## Run on Docker
  - **docker-compose up**
  
  - **if docker-compose is not running properly than we can do following**
    
  - **docker run -d -it -p 3000:3000 <your git user>/helloapp**
  - **docker run -d -it -p 8080:8080 <your git user>/greet-service**

  ## Run on Kubernetes 

  - Open powershell or command line**
  - Go to /greetingsfinal/greetservice/Kubernetes folder**
  - Run command **kubectl apply -f greet-service-deployment.yml**
  - Go to /greetingsfinal/helloapp/Kubernetes folder**
  - Run command **kubectl apply -f helloapp-deployment.yaml**
  - Run command minikube tunnel**
  - In another powershell or command line run command **minikube dashboard**
  - You will see all pods , services and replicas up and green as shown in screenshot
  - helloapp can be accessed on **http://127.0.0.1:3000/**
 -  We can curl the backend service on **http://127.0.0.1:8080/**
  
## Documentation

[Documentation](https://linktodocumentation)

  
## Environment Variables

To run this project, you will need to add the following environment variables to your .env file

`service.greetings.name`

`service.greetings.date-format`

  
## Feedback

If you have any feedback, please reach out to us at anurag171@gmail.com

  
## 🚀 About Me


  
