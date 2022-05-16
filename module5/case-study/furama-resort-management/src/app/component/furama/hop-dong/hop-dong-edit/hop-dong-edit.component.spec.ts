import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HopDongEditComponent } from './hop-dong-edit.component';

describe('HopDongEditComponent', () => {
  let component: HopDongEditComponent;
  let fixture: ComponentFixture<HopDongEditComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HopDongEditComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HopDongEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
