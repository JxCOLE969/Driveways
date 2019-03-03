import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export class DataServiceService {

  private something = new BehaviorSubject<string>("default value");

  exampleLister = new User(1, "Lister", "password", 1, "8989990000");
  exampleRenter = new User(2, "Renter", "password", 0, "9099990000");

  

  someMessage = this.something.asObservable();

  constructor() { }

  changeMessage(message: string) {
    this.something.next(message);
  }
}
