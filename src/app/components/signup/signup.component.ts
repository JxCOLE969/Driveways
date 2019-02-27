import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  username :string;
  password :string;
  role :string;
  phone :string;


  submitSignup() {
    console.log(this.username + " " + this.password + " " + this.role + " " + this.phone);
  }

  // addUser():Observable<User>{
  //   return this.http.post<User>("");
  // }

}
