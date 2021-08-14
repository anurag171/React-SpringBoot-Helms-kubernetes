import axios from 'axios';
import React, { useState, useEffect } from 'react';
import classes from './Greetings.modules.css'


const Greetings = () => {
    const [message, setMessage] = useState('');


    const fetchPost = async (event) => {

        console.log('Calling post get service for message ');
        await axios.get('http://localhost:8080/greetings').then((response) => {
            console.log(response.data);
            setMessage(response.data)
        }, (error) => {
            console.log(error);
        });

    }

    useEffect(() => {
        fetchPost()
    }, []);

    console.log(message);


    return (

      
            <div className={classes.greet}>
                <h1>Welcome</h1>
                <label>{message}</label>
            </div>
       

    );
}

export default Greetings;