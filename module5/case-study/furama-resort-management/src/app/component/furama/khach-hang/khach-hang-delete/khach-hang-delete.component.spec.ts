import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { KhachHangDeleteComponent } from './khach-hang-delete.component';

describe('KhachHangDeleteComponent', () => {
  let component: KhachHangDeleteComponent;
  let fixture: ComponentFixture<KhachHangDeleteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ KhachHangDeleteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(KhachHangDeleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
