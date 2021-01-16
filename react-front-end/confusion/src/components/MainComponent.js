import Menu from './MenuComponent';
import { DISHES } from '../shared/dishes';
import { Component } from 'react';
import DishDetail from './DishDetailComponent';
import Header from './HeaderComponent';
import Footer from './FooterComponent';
import Home from './HomeComponent';
import { Switch, Route, Redirect } from 'react-router-dom';


class Main extends Component {

    constructor(props) {
        super(props);
        console.log('Main Componenet constructor is invoked');

        this.state = {
            dishes: DISHES,
          //  selectedDish: null
        };
    }

   /* onDishSelect(dishId) {
        this.setState({ selectedDish: dishId });
        console.log('Main Componenet onDishSelect is invoked');

    }
    */

    render() {
        console.log('Main Componenet render is invoked');

        const HomePage = () => {
            return(
                <Home />
            );
        }

        return (
            <div>
                <Header />

               {/* <Menu dishes={this.state.dishes} onClick={(dishId) => this.onDishSelect(dishId)} />
                <DishDetail dish={this.state.dishes.filter((dish) => dish.id === this.state.selectedDish)[0]} />
                */}

                <Switch>
                    <Route path="/home" component={HomePage} />
                    <Route exact path="/menu" 
                        component={() => <Menu dishes={this.state.dishes}/>} />
                    
                    <Redirect to="/home" />
                </Switch>
                <Footer />
            </div>
        );
    }
}

export default Main;
