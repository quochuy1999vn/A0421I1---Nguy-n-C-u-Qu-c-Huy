import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { KhachHangEditComponent } from './khach-hang-edit.component';

describe('KhachHangEditComponent', () => {
  let component: KhachHangEditComponent;
  let fixture: ComponentFixture<KhachHangEditComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ KhachHangEditComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(KhachHangEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
