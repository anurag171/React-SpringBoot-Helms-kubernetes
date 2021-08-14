import React from 'react';
import Greetings from './Greetings';
import classes from './App.modules.css';

const App = () => {
    return (
        <div className={classes.message}>
            <Greetings />
        </div>

    );
}

export default App;