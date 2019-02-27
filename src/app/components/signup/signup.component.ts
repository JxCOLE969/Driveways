import { Component, OnInit } from '@angular/core';
import { DataServiceService } from 'src/app/services/data.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  constructor(private data: DataServiceService) { }

  message :string;

  ngOnInit() {
    this.data.someMessage.subscribe(message => this.message = message);
  }

  
  username_register:string;
  password_register :string;
  role_register :string;
  phone_register :string;

  username_login :string;
  password_login :string;


  submitSignup() {
    console.log(this.username_register + " " + this.password_register + " " + this.role_register + " " + this.phone_register);
  }

  submitLogin() {
    console.log(this.username_login + " " + this.password_login);
  }

  // addUser():Observable<User>{
  //   return this.http.post<User>("");
  // }

}
