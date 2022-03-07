import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HuyComponent } from './huy.component';

describe('HuyComponent', () => {
  let component: HuyComponent;
  let fixture: ComponentFixture<HuyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HuyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HuyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
