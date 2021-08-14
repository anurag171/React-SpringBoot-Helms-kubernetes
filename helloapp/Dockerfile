FROM node:alpine
WORKDIR /app
ENV PATH /app/node_modules/.bin:$PATH
COPY package.json ./
COPY package-lock.json ./
RUN npm install
RUN npm install react-scripts@1.1.0 -g
COPY . ./
CMD ["npm","start"]