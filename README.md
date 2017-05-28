# RaVariables

RaVariables provides access to [variables](https://github.com/Redolith/ReActions/wiki/Variables) defined using plugin [ReActions](https://github.com/Redolith/ReActions) from any plugin that supports [PlaceholderAPI](https://github.com/extendedclip/PlaceholderAPI).

You must copy [RaVariables jar file](https://circleci.com/gh/Redolith/RaVariables) in `expansions` folder of PlaceholderAPI plugin directory.
 

## Placehdolders

You can get access to variables defined in ReActions using placeholders:

* `%reactions_var:GlobalVariableId%` - get value of global variable
* `%reactions_varp:PlayerVariableId%` - get value of variable related to current player
* `%reactions_varp:PlayerName.PlayerVariableId%` - get value of variable related to specified player

 
## How to test
* Define variable using reactions (for example variable id is `test`). 
* Type `/papi parse %reactions_var:test%` and you'll get value of `test` variable.
