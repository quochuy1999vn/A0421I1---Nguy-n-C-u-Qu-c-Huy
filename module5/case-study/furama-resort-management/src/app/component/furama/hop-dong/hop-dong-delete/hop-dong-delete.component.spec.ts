import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HopDongDeleteComponent } from './hop-dong-delete.component';

describe('HopDongDeleteComponent', () => {
  let component: HopDongDeleteComponent;
  let fixture: ComponentFixture<HopDongDeleteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HopDongDeleteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HopDongDeleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
