import React from 'react';
import { Card, CardImg, CardText, CardBody, CardTitle, Breadcrumb, BreadcrumbItem } from 'reactstrap';
import { Link } from 'react-router-dom';
import CommentForm from './CommentFormComponent';

//functional component implementation
function RenderDish({ dish }) {
  return (
    <div className="col-12 col-md-5 m-1">
      <Card>
        <CardImg top src={dish.image} alt={dish.name} />
        <CardBody>
          <CardTitle>{dish.name}</CardTitle>
          <CardText>{dish.description}</CardText>
        </CardBody>
      </Card>
    </div>
  );
}


function RenderComments({ comms }) {
  if (comms != null) {
    return (
      <div className="col-12 col-md-5 m-1">
        <h4>Comments</h4>
        <ul className="list-unstyled">
          {comms.map((comm) => {
            return (
              <li key={comm.id}>
                <p>{comm.comment}</p>
                <p>-- {comm.author}, {new Intl.DateTimeFormat('en-US', { year: 'numeric', month: 'short', day: '2-digit' }).format(new Date(Date.parse(comm.date)))}</p>
              </li>
            );
          })}
        </ul>

        <CommentForm />
      </div>
    );
  }
  else {
    return (
      <div></div>
    );
  }
}


const DishDetail = (props) => {
  if (props.dish != null) {
    return (
      <div className="container">
        <div className="row">
          <Breadcrumb>
            <BreadcrumbItem><Link to='/menu'>Menu</Link></BreadcrumbItem>
            <BreadcrumbItem active>{props.dish.name}</BreadcrumbItem>
          </Breadcrumb>
          <div className="col-12">
            <h3>{props.dish.name}</h3>
            <hr />
          </div>
        </div>
        <div className="row">
          <RenderDish dish={props.dish} />
          <RenderComments comms={props.comments} />
        </div>
      </div>
    );
  }
  else {
    return (
      <div></div>
    );
  }
}


export default DishDetail;


/*
//class component implementation
class DishDetail extends Component {

  componentDidMount() {
    console.log('DishDetail Component componentDidMount is invoked');
}

componentDidUpdate() {
  console.log('DishDetail Component componentDidUpdate is invoked');
}

  renderDish(dish) {
    console.log('DishDetail Component renderDish is invoked');

    if (dish != null)
      return (
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
      return (
        <div></div>
      );
  }

  renderComments(comms) {
    console.log('DishDetail Component renderComments is invoked');

    return (
      <ul className="list-unstyled">
        {comms.map((comm) => {
          return (
            <li key={comm.id}>
              <p>{comm.comment}</p>
              <p>-- {comm.author}, {new Intl.DateTimeFormat('en-US', { year: 'numeric', month: 'short', day: '2-digit' }).format(new Date(Date.parse( comm.date )))}</p>
            </li>
          );
        })}
      </ul>
    );
  }


  render() {
    console.log('DishDetail Component render is invoked');
    return (
      <div className="container">
        {this.renderDish(this.props.dish)}
      </div>
    );
  }
}

export default DishDetail;
*/