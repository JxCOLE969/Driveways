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

  submitSignup() {
    console.log("un: , pw: ");
  }

  newMessage() {
    this.data.changeMessage("Changed data from signup")
  }

  // addUser():Observable<User>{
  //   return this.http.post<User>("");
  // }

}
