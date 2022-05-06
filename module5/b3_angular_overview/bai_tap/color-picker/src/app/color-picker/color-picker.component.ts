import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-color-picker',
  templateUrl: './color-picker.component.html',
  styleUrls: ['./color-picker.component.css']
})
export class ColorPickerComponent implements OnInit {

  public background = '#fff';
  colorChange(value: any) {
    this.background = value;
  }

  constructor() { }

  ngOnInit(): void {
  }

}
