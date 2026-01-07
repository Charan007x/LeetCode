/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let act=init;
    let increment=function(){
        return ++init;
    }
    let decrement =function(){
        return --init;
    }
    let reset=function(){
        init=act;
        return act;
    }
    return { increment, decrement, reset };
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */