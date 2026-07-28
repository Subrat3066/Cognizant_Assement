import React, { Component } from "react";

class App extends Component {
  constructor() {
    super();

    this.state = {
      count: 0,
    };
  }

  increment = () => {
    this.setState({
      count: this.state.count + 1,
    });
  };

  decrement = () => {
    this.setState({
      count: this.state.count - 1,
    });
  };

  sayHello = () => {
    alert("Hello! Have a nice day.");
  };

  increase = () => {
    this.increment();
    this.sayHello();
  };

  sayWelcome = (msg) => {
    alert(msg);
  };

  onPress = () => {
    alert("I was clicked");
  };

  render() {
    return (
      <div style={{ margin: "30px" }}>
        <h2>Counter: {this.state.count}</h2>

        <button onClick={this.increase}>Increment</button>

        <button onClick={this.decrement} style={{ marginLeft: "10px" }}>
          Decrement
        </button>

        <br /><br />

        <button onClick={() => this.sayWelcome("Welcome")}>
          Say Welcome
        </button>

        <br /><br />

        <button onClick={this.onPress}>
          Synthetic Event (OnPress)
        </button>

        <br /><br />

        <CurrencyConvertor />
      </div>
    );
  }
}

class CurrencyConvertor extends Component {
  constructor() {
    super();

    this.state = {
      rupees: "",
      euro: "",
    };
  }

  handleChange = (event) => {
    this.setState({
      rupees: event.target.value,
    });
  };

  handleSubmit = () => {
    // Example conversion: 1 Euro = ₹90
    const euro = (this.state.rupees / 90).toFixed(2);

    this.setState({
      euro,
    });
  };

  render() {
    return (
      <div>
        <h2>Currency Convertor</h2>

        <input
          type="number"
          placeholder="Enter Rupees"
          value={this.state.rupees}
          onChange={this.handleChange}
        />

        <button onClick={this.handleSubmit}>
          Convert
        </button>

        <h3>Euro: €{this.state.euro}</h3>
      </div>
    );
  }
}

export default App;