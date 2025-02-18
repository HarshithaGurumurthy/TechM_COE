let student = {
    id: 121,
    name: 'Jerry',
    department: 'Information Technology',
    college: 'XYZ University',
    address: {
        doorNo: '12A',
        street: 'Main Street',
        area: 'Downtown',
        pincode: '123456'
    }
};

function displayStudentDetails() {
    console.log(student);
}

delete student.email;

displayStudentDetails();
