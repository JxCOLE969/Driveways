import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { SignupComponent } from './components/signup/signup.component';
import { CreateListingComponent } from './components/create-listing/create-listing.component';
import { RenterHomeComponent } from './components/renter-home/renter-home.component';
import { ListerHomeComponent } from './components/lister-home/lister-home.component';

const routes: Routes = [
  { path: 'Signup', component: SignupComponent }, 
  { path: '', redirectTo: 'Signup', pathMatch:'full' }, 
  { path: 'create-listing', component: CreateListingComponent },
  { path: 'Renter', component: RenterHomeComponent },
  { path: 'Lister', component: ListerHomeComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
