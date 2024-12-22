import React, { useState } from 'react';
import axios from "axios";
import '../style/UserRegistration.css'; 

const UserRegistration = () => {
  const [userData, setUserData] = useState({
    username: '',
    email: '',
    role: '',
    password: '',
  });

  const [errorMessage, setErrorMessage] = useState('');
  const [successMessage, setSuccessMessage] = useState('');

  const handleChange = (event) => {
        const {name, value} = event.target;
        setUserData({
            ...userData,
            [name] : value
        })         
  }
 
  const handleSubmit = (e) => {
        e.preventDefault();
        if(userData!=null){
        axios.post("http://localhost:8080/api/users",userData)
        .then(response => {
            setSuccessMessage("Registration Successfull")
            setErrorMessage('')
            console.log(response.data)})
        }else{
            setSuccessMessage('')
            setErrorMessage('Input fields are not correct')
        }
  }

  return (
    <div className="form-container">
      <h2>Sign Up</h2>
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
          <label htmlFor="role">Role:</label>
          <input
            type="text"
            id="role"
            name="role"
            value={userData.role}
            onChange={handleChange}
            required
          />
        </div>

        <div className="form-group">
          <label htmlFor="email">Email:</label>
          <input
            type="email"
            id="email"
            name="email"
            value={userData.email}
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

        {errorMessage && <p className="error-message">{errorMessage}</p>}
        {successMessage && <p className="success-message">{successMessage}</p>}

        <button type="submit" className="submit-button">Register</button>
      </form>
    </div>
  );
}

export default UserRegistration;