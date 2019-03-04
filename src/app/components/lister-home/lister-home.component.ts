import { Component, OnInit } from '@angular/core';
import { DataServiceService } from 'src/app/services/data.service';
import { listing } from 'src/app/models/listing';

@Component({
  selector: 'app-lister-home',
  templateUrl: './lister-home.component.html',
  styleUrls: ['./lister-home.component.css']
})
export class ListerHomeComponent implements OnInit {

  constructor(private data: DataServiceService) { }

  ngOnInit() {
  }

  dummyListing: listing = this.data.exampleListing1;
  dummyListing2: listing = this.data.exampleListing2;

  username :string = this.data.currentUser.username;
  

// dummyListing.lid :number, uid :number, spots :number, active :number, 
// address :string, description :string, distance :number, cost :number


}
