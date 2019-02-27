import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { SignupComponent } from './components/signup/signup.component';
<<<<<<< HEAD
=======
import { CreateListingComponent } from './components/create-listing/create-listing.component';
>>>>>>> 220c4e1ede2a3777e97a240980f967f83a458b03

const routes: Routes = [{ path: 'signup', component: SignupComponent }, {path: 'home', component: AppComponent }, { path: 'create-listing', component: CreateListingComponent }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
