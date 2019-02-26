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

  submitSignup() {
    console.log("un: , pw: ");
  }

  // addUser():Observable<User>{
  //   return this.http.post<User>("");
  // }

}
