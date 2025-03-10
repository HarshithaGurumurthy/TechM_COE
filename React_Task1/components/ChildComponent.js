import React from 'react';

const ChildComponent = ({ users }) => {
    return (
        <div>
            <h3>Child Component</h3>
            <div className="card p-3">
                {users.map(user => (
                    <div key={user.id} className="border-bottom p-2">
                        {user.name} - {user.email}
                    </div>
                ))}
            </div>
        </div>
    );
};

export default ChildComponent;
