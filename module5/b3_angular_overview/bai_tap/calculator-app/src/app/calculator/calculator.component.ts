import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {

  public number1: number;
  public number2: number;
  public result: number;

  constructor() { }

  sum() {
    this.result = this.number1 + this.number2;
  }

  minus() {
    this.result = this.number1 - this.number2;
  }

  mult() {
    this.result = this.number1 * this.number2;
  }

  div() {
    this.result = this.number1 / this.number2;
  }

  ngOnInit(): void {
  }

}
