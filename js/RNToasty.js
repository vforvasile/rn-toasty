import { PureComponent } from "react";
import { ViewPropTypes, NativeModules, Platform } from "react-native";
import PropTypes from "prop-types";
const { RNToasty } = NativeModules;

class Toasty extends PureComponent {
  static propTypes = {
    ...ViewPropTypes,
    type: PropTypes.number,
    title: PropTypes.string,
    titleSize: PropTypes.number,
    titleColor: PropTypes.string,
    duration: PropTypes.number,
    tintColor: PropTypes.string,
    withIcon: PropTypes.bool,
    icon: PropTypes.object
  };

  static defaultProps = {
    type: 0,
    title: "",
    titleSize: 0,
    titleColor: "",
    duration: 0,
    tintColor: "",
    withIcon: false,
    icon: undefined
  };

  static Duration = {
    Short: 0,
    Long: 1
  };

  static Types = {
    Normal: 0
  };

  static Show(props) {
    if (!props)
      props = {
        withIcon: undefined
      };
    if (props.type === undefined) props.type = Toasty.defaultProps.type;
    if (props.title === undefined) props.title = Toasty.defaultProps.title;
    if (props.titleSize === undefined)
      props.titleSize = Toasty.defaultProps.titleSize;
    if (props.titleColor === undefined)
      props.titleColor = Toasty.defaultProps.titleColor;

    if (props.duration === undefined)
      props.duration = Toasty.defaultProps.duration;

    if (props.tintColor === undefined)
      props.tintColor = Toasty.defaultProps.tintColor;

    RNToasty.Show(props);
  }

  static normalStyle = {
    tintColor: "#484d51"
  };

  static Normal(props) {
    if (!props) props = {};
    if (props.tintColor === undefined && Platform.OS === "ios")
      props.tintColor = Toasty.normalStyle.tintColor;

    props.type = Toasty.Types.Normal;

    Toasty.Show(props);
  }

  componentDidMount() {}

  componentDidUpdate() {}

  show() {}

  render() {
    return null;
  }
}

export { Toasty as RNToasty };
