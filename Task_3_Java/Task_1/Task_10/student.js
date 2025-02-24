let student = {
  name: "Alice",
  age: 22,
  course: "Computer Science",
  displayInfo: function () {
    console.log(`Name: ${this.name}, Age: ${this.age}, Course: ${this.course}`);
  }
};


student.displayInfo(); 

student.address = {
  city: "New York",
  zip: "10001"
};

student.updateCourse = function (newCourse) {
  this.course = newCourse;
  console.log(`Course updated to: ${this.course}`);
};

student.showAddress = function () {
  console.log(`City: ${this.address.city}, ZIP: ${this.address.zip}`);
};


student.updateCourse("Mathematics");  
student.showAddress();               
student.displayInfo();                


delete student.age;          
delete student.showAddress;  
console.log(student);
