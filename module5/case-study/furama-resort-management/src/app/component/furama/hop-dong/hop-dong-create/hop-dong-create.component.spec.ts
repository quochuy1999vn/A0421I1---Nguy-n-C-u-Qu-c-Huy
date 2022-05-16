import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HopDongCreateComponent } from './hop-dong-create.component';

describe('HopDongCreateComponent', () => {
  let component: HopDongCreateComponent;
  let fixture: ComponentFixture<HopDongCreateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HopDongCreateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HopDongCreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
