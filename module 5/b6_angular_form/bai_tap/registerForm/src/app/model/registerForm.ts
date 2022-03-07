export class RegisterForm {
  email: string;
  password: string;
  confirmPassword: string;
  country: string;
  age: string;
  gender: boolean;
  phone: string;

  constructor(email: string, password: string, confirmPassword: string, country: string, age: string, gender: boolean, phone: string) {
    this.email = email;
    this.password = password;
    this.confirmPassword = confirmPassword;
    this.country = country;
    this.age = age;
    this.gender = gender;
    this.phone = phone;
  }
}

