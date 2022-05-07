import { Component, OnInit } from '@angular/core';
import {FormGroup, FormControl, Validators, ValidationErrors, AbstractControl, ValidatorFn} from '@angular/forms';


@Component({
  selector: 'app-register-form',
  templateUrl: './register-form.component.html',
  styleUrls: ['./register-form.component.css']
})
export class RegisterFormComponent implements OnInit {

  countrys = ['Đà Nẵng', 'Huế', 'Quảng Nam'];

  selected = 'choose country';

  public registerForm = new FormGroup({
    email: new FormControl('', [Validators.required, Validators.email]),
    pws: new FormGroup({
      password: new FormControl('', [Validators.required, Validators.minLength(6)]),
      confirmPass: new FormControl('', [Validators.required, Validators.minLength(6)])
    }, this.comparePassword),
    country: new FormControl('', [Validators.required]),
    age: new FormControl('', [Validators.required, Validators.minLength(18)]),
    gender: new FormControl('', [Validators.required]),
    phone: new FormControl('', [Validators.required, Validators.pattern(/^\+84\d{9,10}$/)])
  });

  constructor() { }

  ngOnInit(): void {
  }

  comparePassword( c: AbstractControl) {
    const v = c.value;
    return (v.password === v.confirmPass) ?
      null : {
        passwordnotmatch: true
      } ;
  }

  get email(){
    return this.registerForm.get('email');
  }
  get password(){
    return this.registerForm.get('pwGroup').get('password');
  }
  get confirmPassword() {
    return this.registerForm.get('pwGroup').get('confirmPass');
  }
  get country(){
    return this.registerForm.get('country');
  }
  get age(){
    return this.registerForm.get('age');
  }
  get gender(){
    return this.registerForm.get('gender');
  }
  get phone(){
    return this.registerForm.get('phone');
  }

  onSubmit() {
    console.log(this.registerForm.value);
  }
}
