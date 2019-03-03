import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../models/User';

@Injectable({
  providedIn: 'root'
})
export class LoginServiceService {

  constructor(private http :HttpClient) { }

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type':  'application/json',
      'X-Requested-With': 'XMLHttpRequest'
    })
  };

  getUser(username :string, password :string) :Observable<User>
  {
    return this.http.get<User>("http://localhost:3001/DrivewaysBackend/webapi/listings");
  }
}
