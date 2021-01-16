import Main from './components/MainComponent';
import './App.css';
import { Component } from 'react';

class App extends Component {

  render() {
    console.log('App.js render is invoked');

    return (
      <div>
        <Main />
      </div>
    );
  }
}

export default App;
