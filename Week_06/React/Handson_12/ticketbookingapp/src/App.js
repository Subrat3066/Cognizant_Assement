import React, { Component } from "react";

function GuestPage(props) {
  return (
    <div>
      <h2>Welcome Guest</h2>

      <h3>Flight Details</h3>

      <table border="1" cellPadding="10">
        <thead>
          <tr>
            <th>Flight</th>
            <th>Source</th>
            <th>Destination</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>AI101</td>
            <td>Chennai</td>
            <td>Delhi</td>
          </tr>

          <tr>
            <td>AI202</td>
            <td>Mumbai</td>
            <td>Bangalore</td>
          </tr>
        </tbody>
      </table>

      <br />

      <button onClick={props.login}>
        Login
      </button>
    </div>
  );
}

function UserPage(props) {
  return (
    <div>
      <h2>Welcome User</h2>

      <h3>You can now book your tickets.</h3>

      <button>Book Ticket</button>

      <br /><br />

      <button onClick={props.logout}>
        Logout
      </button>
    </div>
  );
}

class App extends Component {

  constructor() {
    super();

    this.state = {
      isLoggedIn: false
    };
  }

  login = () => {
    this.setState({
      isLoggedIn: true
    });
  };

  logout = () => {
    this.setState({
      isLoggedIn: false
    });
  };

  render() {

    if (this.state.isLoggedIn) {
      return <UserPage logout={this.logout} />;
    } else {
      return <GuestPage login={this.login} />;
    }

  }
}

export default App;