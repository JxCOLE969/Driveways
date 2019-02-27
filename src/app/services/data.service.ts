import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataServiceService {

  private something = new BehaviorSubject<string>("default value");
  
  someMessage = this.something.asObservable();
  
  constructor() { }

  changeMessage(message: string) {
    this.something.next(message);
  }
}
