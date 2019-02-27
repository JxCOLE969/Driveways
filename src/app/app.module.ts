import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SignupComponent } from './components/signup/signup.component';
<<<<<<< HEAD
=======
import { CreateListingComponent } from './components/create-listing/create-listing.component';
>>>>>>> 220c4e1ede2a3777e97a240980f967f83a458b03

@NgModule({
  declarations: [
    AppComponent,
    SignupComponent,
    CreateListingComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
