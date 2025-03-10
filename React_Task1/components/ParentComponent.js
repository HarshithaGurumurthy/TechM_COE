import React, { useEffect, useState } from 'react';
import axios from 'axios';
import ChildComponent from './ChildComponent';

const ParentComponent = () => {
    const [users, setUsers] = useState([]);

    useEffect(() => {
        axios.get('https://jsonplaceholder.typicode.com/users')
            .then(response => setUsers(response.data))
            .catch(error => console.error("Error fetching users:", error));
    }, []);

    return (
        <div>
            <h2 className="text-primary">Parent Component</h2>
            <ChildComponent users={users} />
        </div>
    );
};

export default ParentComponent;
