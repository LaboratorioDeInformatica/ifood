import { Component } from 'react';
import { Redirect, Route } from 'react-router-dom';
import { runInThisContext } from 'vm';
import Tab3 from './Voucher';


class ReactGuard extends Route {
    comp: any
    constructor(props: any) {
        super(props)
        this.comp = this.props.component;
    }


    render() {
        const token = localStorage.getItem('token')


        //verific apenas se retornou algo pq "faz sentido" no cenário
        if (token) {
            return (
                <Route render={() => {
                    return (<Route component={this.props.component}></Route>)
                }} />
            )
        } else {

            return <Redirect to="/tab1" />
        }


    }




}


export default ReactGuard