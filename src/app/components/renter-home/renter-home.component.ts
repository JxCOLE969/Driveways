import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-renter-home',
  templateUrl: './renter-home.component.html',
  styleUrls: ['./renter-home.component.css']
})
export class RenterHomeComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  myEvent(event) {
    alert("You have reserved this spot");
    console.log("Hello World");

  }


}
