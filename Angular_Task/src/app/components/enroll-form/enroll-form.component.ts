import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-enroll-form',
  templateUrl: './enroll-form.component.html',
  styleUrls: ['./enroll-form.component.css']
})
export class EnrollFormComponent {
  enrollForm: FormGroup;

  constructor(private fb: FormBuilder) {
    this.enrollForm = this.fb.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      phone: ['', [Validators.required, Validators.pattern('^[0-9]+$')]],
      course: ['', Validators.required]
    });
  }

  submitForm() {
    if (this.enrollForm.valid) {
      console.log("Form Data: ", this.enrollForm.value);
      alert("Enrollment Successful!");
    } else {
      alert("Please fill in all required fields.");
    }
  }
}
