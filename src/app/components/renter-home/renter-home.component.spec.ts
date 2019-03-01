import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RenterHomeComponent } from './renter-home.component';

describe('RenterHomeComponent', () => {
  let component: RenterHomeComponent;
  let fixture: ComponentFixture<RenterHomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RenterHomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RenterHomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
