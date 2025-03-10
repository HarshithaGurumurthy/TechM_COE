import React, { useState } from 'react';
import ParentComponent from './components/ParentComponent';

const App = () => {
    const [formData, setFormData] = useState({
        name: '',
        email: '',
        age: '',
        phone: '',
        course: '',
    });

    const courses = [
        "Fashion Illustration",
        "Textile Design",
        "Garment Construction",
        "Fashion Marketing",
        "Sustainable Fashion",
        "Styling & Photography",
        "Fashion Business Management",
    ];

    const handleChange = (e) => {
        setFormData({ ...formData, [e.target.name]: e.target.value });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        alert(`Student Registered!\n\nName: ${formData.name}\nEmail: ${formData.email}\nAge: ${formData.age}\nPhone: ${formData.phone}\nCourse: ${formData.course}`);
        setFormData({ name: '', email: '', age: '', phone: '', course: '' });
    };

    return (
        <div className="container mt-4">
            <h1 className="text-center text-success">Fashion Designing Course Registration</h1>

            {/* Parent-Child Component */}
            <ParentComponent />

            {/* Student Registration Form */}
            <div className="mt-4">
                <h2>Student Registration Form</h2>
                <form onSubmit={handleSubmit}>
                    <div className="mb-3">
                        <label className="form-label">Name</label>
                        <input
                            type="text"
                            className="form-control"
                            name="name"
                            value={formData.name}
                            onChange={handleChange}
                            required
                        />
                    </div>

                    <div className="mb-3">
                        <label className="form-label">Email</label>
                        <input
                            type="email"
                            className="form-control"
                            name="email"
                            value={formData.email}
                            onChange={handleChange}
                            required
                        />
                    </div>

                    <div className="mb-3">
                        <label className="form-label">Age</label>
                        <input
                            type="number"
                            className="form-control"
                            name="age"
                            value={formData.age}
                            onChange={handleChange}
                            required
                        />
                    </div>

                    <div className="mb-3">
                        <label className="form-label">Phone Number</label>
                        <input
                            type="text"
                            className="form-control"
                            name="phone"
                            value={formData.phone}
                            onChange={handleChange}
                            required
                        />
                    </div>

                    <div className="mb-3">
                        <label className="form-label">Select Course</label>
                        <select
                            className="form-control"
                            name="course"
                            value={formData.course}
                            onChange={handleChange}
                            required
                        >
                            <option value="">-- Select a Course --</option>
                            {courses.map((course, index) => (
                                <option key={index} value={course}>
                                    {course}
                                </option>
                            ))}
                        </select>
                    </div>

                    <button type="submit" className="btn btn-primary">Register</button>
                </form>
            </div>
        </div>
    );
};

export default App;
