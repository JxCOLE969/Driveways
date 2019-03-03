import { Component, OnInit } from '@angular/core';
import { DataServiceService } from 'src/app/services/data.service';
import { User } from 'src/app/models/user';

@Component({
  selector: 'app-create-listing',
  templateUrl: './create-listing.component.html',
  styleUrls: ['./create-listing.component.css']
})
export class CreateListingComponent implements OnInit {

  constructor(private data: DataServiceService) { }

  message :string;

  dummyLister :User = this.data.exampleLister;
  dummyRenter :User = this.data.exampleRenter;

  ngOnInit() {
    this.data.someMessage.subscribe(message => this.message = message);
  }

  newMessage() {
    this.data.changeMessage("Changed data from create-listing")
  }

}
