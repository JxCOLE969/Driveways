import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { User } from '../models/user';
import { listing } from '../models/listing';

@Injectable({
  providedIn: 'root'
})
export class DataServiceService {

  private something = new BehaviorSubject<string>("default value");

  exampleLister = new User(1, "Lister", "password", 1, "8989990000");
  exampleRenter = new User(2, "Renter", "password", 0, "9099990000");


  exampleListing1 = new listing(0, 1, 3, 1, "1234 Home Ave", "Hello World Description", 5, 5);
  exampleListing2 = new listing(1, 2, 2, 1, "1234 Example Ave", "Hello World Description 2", 15, 5);

  someMessage = this.something.asObservable();

  constructor() { }

  changeMessage(message: string) {
    this.something.next(message);
  }
}
