import logo from './logo.svg';
import './App.css';
import Card from './product';
import { Link } from 'react-router-dom';

function App() {
  return <div className='Container'>
    <div className='button-container'>
      <Link to="/user"><button>User</button></Link>
      <Link to="/product"><button>Product</button></Link>
    </div>
  </div>
}

export default App;
