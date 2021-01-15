import React, { Component } from 'react';
import { Card, CardImg, CardText, CardBody, CardTitle } from 'reactstrap';


class DishDetail extends Component {
    renderDish(dish) {
      if (dish != null)
        return(
          <div className="row">
            <div className="col-12 col-md-5 m-1">
              <Card>
                <CardImg width="100%" top src={dish.image} alt={dish.name} />
                <CardBody>
                  <CardTitle>{dish.name}</CardTitle>
                  <CardText>{dish.description}</CardText>
                </CardBody>
              </Card>
            </div>
            <div className="col-12 col-md-5 m-1">
              <h4>Comments</h4>
              {this.renderComments(dish.comments)}
            </div>
          </div>
        );
      else
        return(
          <div></div>
        );
    }

    renderComments(comms) {
      return (
        <ul className="list-unstyled">
          {comms.map((comm) => {
            return (
              <li key={comm.id}>
                <p>{comm.comment}</p>
                <p>-- {comm.author}, {this.setDate(comm.date)}</p>
              </li>
            );
          })}
        </ul>
      );
    }

    setDate(date) {
      let now = new Date(date);
      const dt = {year: 'numeric', month: 'long', day: 'numeric'};
      return now.toLocaleDateString(now.getTimezoneOffset(), dt);
    }

    render() {
        return (
          <div className="container">
            {this.renderDish(this.props.dish)}
          </div>
        );
    }
}

export default DishDetail;