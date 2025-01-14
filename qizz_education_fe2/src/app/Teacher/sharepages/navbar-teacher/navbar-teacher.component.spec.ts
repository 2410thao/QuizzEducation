import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NavbarTeacherComponent } from './navbar-teacher.component';

describe('NavbarTeacherComponent', () => {
  let component: NavbarTeacherComponent;
  let fixture: ComponentFixture<NavbarTeacherComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [NavbarTeacherComponent]
    });
    fixture = TestBed.createComponent(NavbarTeacherComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
