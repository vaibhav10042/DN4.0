import React from 'react'
import { useState } from 'react'
const Rejister = () => {
    const [formData, setFormData] = useState({
    name: '',
    email: '',
    password: '',
  });
  const [erros, seterrors] = useState({});
  const handleChange = (e) =>{
    const {name, value} = e.target;

    setFormData((prevData) => ({
        ...prevData,
        [name]: value,
    }));
    validateField(name, value);
  };
  const validateField = (name, value) => {
    let error = '';
    if(name === 'name' && value.length < 5){
        error = 'Name must be at least 6 characters long.';
    }else if(name === 'email' && (!value.includes('@') || !value.includes('.'))){
        error = 'Email must contain @ and .';
    }else if(name === 'password' && value.length < 8){
        error = 'Password must be at least 8 characters.';
    }
    seterrors((prevData) => ({
      ...prevData,
      [name]: error,
    }));
  }
  const handleSubmit = (e) => {
    e.preventDefault();

    const newErrors = {};
    if (formData.name.length < 5)
      newErrors.name = 'Name must be at least 5 characters long.';
    if (!formData.email.includes('@') || !formData.email.includes('.'))
      newErrors.email = 'Email must contain "@" and "."';
    if (formData.password.length < 8)
      newErrors.password = 'Password must be at least 8 characters.';

    seterrors(newErrors);

    if (Object.keys(newErrors).length === 0) {
      alert('Form submitted successfully!');
      setFormData({ name: '', email: '', password: '' });
    }
  };
  return (
    <div style={{ maxWidth: '400px', margin: 'auto' }}>
      <form onSubmit={handleSubmit}>
        <div>
        <input name='name'type='text' placeholder='Enter your Name....' value={formData.name}
            onChange={handleChange}></input><div style={{ color: 'red' }}>{erros.name}</div>
            </div>
            <div>
        <input name='email'type='email' placeholder='Youremail@gmail....' value = {formData.email}
        onChange={handleChange}></input>
        </div>
        <div>
        <input type='password' name='password' placeholder='password..' value = {formData.password}
        onChange={handleChange}></input></div>
        <div style={{ color: 'red' }}>{erros.password}</div>
        <button type='submit'>Register</button>
      </form>
    </div>
  )
}

export default Rejister
