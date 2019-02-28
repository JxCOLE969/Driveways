import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SignupComponent } from './components/signup/signup.component';
import { CreateListingComponent } from './components/create-listing/create-listing.component';
import { RenterHomeComponent } from './components/renter-home/renter-home.component';
import { ListerHomeComponent } from './components/lister-home/lister-home.component';

@NgModule({
  declarations: [
    AppComponent,
    SignupComponent,
    CreateListingComponent,
    RenterHomeComponent,
    ListerHomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
