import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListerHomeComponent } from './lister-home.component';

describe('ListerHomeComponent', () => {
  let component: ListerHomeComponent;
  let fixture: ComponentFixture<ListerHomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListerHomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListerHomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
