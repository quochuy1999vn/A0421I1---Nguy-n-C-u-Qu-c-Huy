import { Component, OnInit } from '@angular/core';
import {AbstractControl, FormBuilder, FormGroup, Validators} from '@angular/forms';


export function compareEmail(c: AbstractControl) {
  const v = c.value;
  return (v.password === v.confirmPassword) ? null : {passwordNotMatch: true};
}
@Component({
  selector: 'app-register-form',
  templateUrl: './register-form.component.html',
  styleUrls: ['./register-form.component.css']
})
export class RegisterFormComponent implements OnInit {

  registerForm: FormGroup;
  constructor(private formBuilder: FormBuilder) { }

  ngOnInit(): void {
    this.registerForm = this.formBuilder.group({
      email: [``, [Validators.required, Validators.email]],
      country: ['', [Validators.required]],
      age: ['', [Validators.required], Validators.min(18)],
      gender: ['', [Validators.required]],
      phone: ['', [Validators.required], Validators.pattern('^\\+84\\d{9,10}$')],
      pwGroup: this.formBuilder.group({
        password: ['', [Validators.required, Validators.minLength(6)]],
        confirmPassword: ['', [Validators.required]]
      }),
    });
  }

  onSubmit() {

  }

}
