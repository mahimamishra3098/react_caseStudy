import React from 'react';
import UserServices from '../services/UserServices';

class UserComponent extends React.Component{
    constructor(props){
        super(props)
        this.state = {
            transactions:[]
        }
    }

    componentDidMount(){
        UserServices.getTransaction().then((response) => {
            this.setState({transactions: response.data})
        });
    }

    render(){
        return(
            <div>
                <h1 className = "text-center">Bank Transaction data</h1>
                <table className = "table table-striped">
                    <thead>
                        <tr>
                            <td>Transaction ID</td>
                            <td>Transaction Date</td>
                            <td>User ID</td>
                            <td>Account ID</td>
                            <td>Amount</td>
                            <td>Amount Balance</td>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.transactions.map(
                                transaction =>
                                <tr key = {transaction.id}>
                                    <td> {transaction.id} </td>
                                    <td> {transaction.date} </td>
                                    <td> {transaction.user_id} </td>
                                    <td> {transaction.acc_id} </td>
                                    <td> {transaction.amt_credit} </td>
                                    <td> {transaction.amt_debit} </td>
                                </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>
        )
    }
}
export default UserComponent