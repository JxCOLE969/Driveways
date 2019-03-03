import { Component, OnInit } from '@angular/core';
import { DataServiceService } from 'src/app/services/data.service';
import { LoginServiceService } from 'src/app/services/login-service.service';
import { Observable } from 'rxjs';
import { User } from 'src/app/models/user';
import { Router, RouterModule } from '@angular/router';

declare var $: any;

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {



  constructor(private data: DataServiceService, private login: LoginServiceService, private router: Router) { }

  message: string;


  ngOnInit() {
    this.data.someMessage.subscribe(message => this.message = message);
  }

  navigate() {
    if (this.username_login == this.dummyLister.username) {
      this.router.navigate(["Lister"]);
    } else {
      this.router.navigate(["Renter"]);
    }
  }


  dummyLister: User = this.data.exampleLister;
  dummyRenter: User = this.data.exampleRenter;


  username_register: string;
  password_register: string;
  role_register: string;
  phone_register: string;

  username_login: string;
  password_login: string;

  username: string = '';


  submitSignup() {
    console.log(this.username_register + " " + this.password_register + " " + this.role_register + " " + this.phone_register);
  }

  submitLogin() {

    alert("submit login")

    if (this.username_login == this.dummyLister.username && this.password_login == this.dummyLister.password) {
      alert("if")
       this.navigate();

    } else if (this.username_login == this.dummyRenter.username && this.password_login == this.dummyRenter.password) {
      alert("else if")
      this.navigate();
    }

    // let verify :Observable<User> = this.login.getUser(this.username_login, this.password_login);

    // verify.subscribe(
    //   (response) => {
    //     console.log(response);
    //     $('#loginModal').modal('toggle');
    //     this.username = response.username;
    //   }
    //   ,
    //   (response) => {
    //     console.log(response);
    //     this.username = '';
    //   }

    // )

    // console.log(this.username_login + " " + this.password_login);
  }

  // addUser():Observable<User>{
  //   return this.http.post<User>("");
  // }

}
