import React, { useState } from 'react';
import '../style/UserRegistration.css';
import CourseList from './CourseList';

const Login = () => {
    const [userData, setUserData] = useState({
        username: '',
        password: ''
    })

    const [flag,setFlag] = useState(false);

    const handleChange = (e) => {
        const {name, value} = e.target;
        setUserData({
            ...userData,
            [name]:value
        })
    }

    const handleSubmit = (e) => {
        e.preventDefault();
        if(userData!=null){
            setFlag(true)
        }       
    }

    return (
        <div className="form-container">
            <h2>Sign In</h2>
            <form className="registration-form" onSubmit={handleSubmit}>
                <div className="form-group">
                    <label htmlFor="username">Username:</label>
                    <input
                        type="text"
                        id="username"
                        name="username"
                        value={userData.username}
                        onChange={handleChange}
                        required
                    />
                </div>

                <div className="form-group">
                    <label htmlFor="password">Password:</label>
                    <input
                        type="password"
                        id="password"
                        name="password"
                        value={userData.password}
                        onChange={handleChange}
                        required
                    />
                </div>

                {/* {errorMessage && <p className="error-message">{errorMessage}</p>}
                {successMessage && <p className="success-message">{successMessage}</p>} */}

                <button type="submit" className="submit-button">Register</button>
            </form>
            {flag && <CourseList/>}
        </div>
    );
}
export default Login;