'use strict';

import React, { Component } from 'react';
import { requireNativeComponent, View } from 'react-native';

import {
  StyleSheet,
  Text,
} from 'react-native';

class TextInputLayout extends Component {
  constructor(props) {
    super(props);

    this.state = {

    };
  }

  render() {
    return (
      <RNTextInputLayout {...this.props} />
    );
  }
}

var styles = {

}

var RNTextInputLayout = requireNativeComponent('RNTextInputLayout', null);

module.exports = TextInputLayout;
